package com.lei.boot.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.os.windows.Windows;

import javax.swing.*;
import java.applet.Applet;
import java.io.DataInput;
import java.io.InputStream;
import java.io.RandomAccessFile;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-31 21:56
 */
@RestController
public class PageOne {
    @GetMapping("/")
    public String get(){
        return "GetOne";
    }
}
