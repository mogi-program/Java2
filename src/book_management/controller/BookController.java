package book_management.controller;

import book_management.domain.Book;
import book_management.repository.BookRepository;
import book_management.view.BookInsertPan;
import book_management.view.BookSearchPan;
import book_management.view.center.CenterFrame2;
import book_management.view.center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class BookController extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    BookRepository repository;
    ArrayList<Book> bookList;
    JComboBox<String> combo;
    BookSearchPan searchPan;
    BookInsertPan insertPan;

    public BookController() {
        searchPan = new BookSearchPan();
        combo = searchPan.getCombo();
        repository = new BookRepository();
        bookList = repository.select(searchPan.getSearchWord(), combo.getSelectedIndex());
        searchPan.setBookList(bookList);
        searchPan.initView();

        insertPan = new BookInsertPan();
        insertPan.setBookList(bookList);
        insertPan.initView();

        JButton btnSearch = searchPan.getBtnSearch();
        btnSearch.addActionListener(btnSearchListener);

        JButton btnInsert = insertPan.getBtnInsert();
        btnInsert.addActionListener(btnInsertListener);

        tabbedPane.add("도서 검색", searchPan);
        tabbedPane.add("도서 추가", insertPan);
        add(tabbedPane);

        SetFrame.setFrame(this, 700, 600, "도서관리 시스템");

    }

    ActionListener btnSearchListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            bookList = repository.select(searchPan.getSearchWord(), combo.getSelectedIndex());
            searchPan.setBookList(bookList);
            searchPan.putSearchResult();
        }
    };

    ActionListener btnInsertListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            repository.insert(insertPan.getBook());
            ArrayList<Book> insertBookList = new ArrayList<Book>();
            insertBookList = repository.select("", 0);
            insertPan.setBookList(insertBookList);
            insertPan.putSearchResult();
        }
    };

    public static void main(String[] args) {
        new BookController();
    }
}
