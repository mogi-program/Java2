package ai1103;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LabMenu extends JFrame {
    JTextArea textArea = new JTextArea();
    JFileChooser chooser = new JFileChooser();
    JFrame frame;
    File selectedFile;
    JButton[] btns = new JButton[6];
    String[] iconFileNames = {"new", "open", "close"};
    Color[] colorNames = new Color[]{Color.RED, Color.BLUE, Color.MAGENTA};
    LabMenu() {
        frame = this;
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane);

        JToolBar toolBar = new JToolBar();
        add("North", toolBar);

        for(int i = 0 ; i < btns.length ; i++){

            if(i < 3){
                btns[i] = new JButton(new ImageIcon("img/" + iconFileNames[i] + ".jpg"));
            }else{
                btns[i] = new JButton();
                btns[i].setBackground(colorNames[i-3]);
            }
            btns[i].addActionListener(btnListener);
            toolBar.add(btns[i]);
        }

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem closeMenuItem = new JMenuItem("Close");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(closeMenuItem);
        fileMenu.add(saveMenuItem);
        newMenuItem.addActionListener(fileListener);
        openMenuItem.addActionListener(fileListener);
        closeMenuItem.addActionListener(fileListener);
        saveMenuItem.addActionListener(fileListener);

        JMenuItem redMenuItem = new JMenuItem("Red");
        JMenuItem blueMenuItem = new JMenuItem("Blue");
        JMenuItem magentaMenuItem = new JMenuItem("Magenta");
        redMenuItem.addActionListener(colorListener);
        blueMenuItem.addActionListener(colorListener);
        magentaMenuItem.addActionListener(colorListener);
        editMenu.add(redMenuItem);
        editMenu.add(blueMenuItem);
        editMenu.add(magentaMenuItem);

        SetFrame.setFrame(this,500, 500 , "메뉴만들기");
    }
    ActionListener backgroundListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Red")){
                textArea.setBackground(Color.RED);
            }
            else if(e.getActionCommand().equals("Blue")){
                textArea.setBackground(Color.BLUE);
            }
            else if(e.getActionCommand().equals("Magenta")){
                textArea.setBackground(Color.MAGENTA);
            }

        }
    };
    ActionListener colorListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Red")){
                textArea.setForeground(Color.RED);
            }
            else if(e.getActionCommand().equals("Blue")){
                textArea.setForeground(Color.BLUE);
            }
            else if(e.getActionCommand().equals("Magenta")){
                textArea.setForeground(Color.MAGENTA);
            }
        }
    };
    ActionListener fileListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Close")){
                System.exit(0);
            }
            else if(e.getActionCommand().equals("New")){
                textArea.setText("");
            }
            else if(e.getActionCommand().equals("Open")){
                chooser.showOpenDialog(frame);
                selectedFile = chooser.getSelectedFile();
                textArea.setText(readFile(selectedFile));
            }
            else if(e.getActionCommand().equals("Save")){
                int result = chooser.showSaveDialog(frame);

                if(result == JFileChooser.APPROVE_OPTION){
                    selectedFile = chooser.getSelectedFile();
                    saveFile(selectedFile);
                }
            }
        }
    };

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton eBtn = (JButton) e.getSource();
            File selectedFile;
            if (eBtn == btns[0]) {
                textArea.setText("");
            } else if (eBtn == btns[1]) {
                chooser.showOpenDialog(frame);
                selectedFile = chooser.getSelectedFile();
                textArea.setText(readFile(selectedFile));
            } else if (eBtn == btns[2]) {
                System.exit(0);
            }

            for(int i = 0 ; i < colorNames.length ; i++){
                if(eBtn == btns[i+3]){
                    textArea.setBackground(colorNames[i]);
                }
            }
        }
    };

    public static void main(String[] args) {
        new LabMenu();
    }

    public String readFile(File selectedFile){
        String result = "";
        try {
            FileReader fr = new FileReader(selectedFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                result += line + "\n";
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public void saveFile(File selectedFile){
        try {
            FileWriter fw = new FileWriter(selectedFile);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(textArea.getText());

            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
