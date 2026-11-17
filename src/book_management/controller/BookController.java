package book_management.controller;

import book_management.domain.Book;
import book_management.repository.BookRepository;
import book_management.view.BookSearchPan;
import book_management.view.center.CenterFrame2;
import book_management.view.center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BookController extends JFrame {
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    BookRepository repository;
    ArrayList<Book> bookList;
    JComboBox<String> combo;

    public BookController() {
        BookSearchPan searchPan = new BookSearchPan();
        combo = searchPan.getCombo();
        repository = new BookRepository();
        bookList = repository.select(searchPan.getSearchWord(), combo.getSelectedIndex());
        searchPan.setBookList(bookList);
        searchPan.initView();

        tabbedPane.add("Search", searchPan);

        add(tabbedPane);

        SetFrame.setFrame(this, 700, 600, "도서관리 시스템");

    }

    public static void main(String[] args) {
        new BookController();
    }
}
