///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Controller;
//
//import View.UserLapor;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
///**
// *
// * @author Shamgar
// */
//public class Controller_UserLapor implements ActionListener{
//
//    private UserLapor lapor;
//
//    public Controller_UserLapor() {
//        lapor = new UserLapor();
//        lapor.addActionListener(this);
//        System.out.println("MASUK CHOME");
//        lapor.setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//        if (source.equals(lapor.getUserLapor())){
//            new Controller();
//            home.setVisible(false);
//        }
//    }
//
//
//}
