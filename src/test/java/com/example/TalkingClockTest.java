package com.example;

import org.junit.Test;

import javax.swing.*;

public class TalkingClockTest {

    @Test
    public void testStart() {
        TalkingClock talkingClock = new TalkingClock(2000, true);
        TalkingClock.TimePrinter timePrinter = talkingClock.new TimePrinter();
        talkingClock.start();


        // 保持程序的运行，直到用户点击确定
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
