package com.example.demo;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


@Component
public class CommandRunner extends poiClass implements CommandLineRunner {
    @Autowired
    @Getter
    private DenemeRepository denemeRepository;


    public boolean camStatus(String ip){

        String addr = ip;
        int openPort = 22;   // openPort =  22 - ssh, 80 or 443 - webserver, 25 - mailserver etc.
        int timeOutMillis = 2000;

        try {
            try (Socket soc = new Socket()) {
                soc.connect(new InetSocketAddress(addr, openPort), timeOutMillis);
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @Override
    public void run(String... args) throws IOException {

        ArrayList<String> ipArray = new ArrayList<String>();
        ipArray=readingExcelforCameraIP();

        ArrayList<String> nameArray = new ArrayList<String>();
        nameArray=readingExcelforCameraname();

        ArrayList<String> typeArray = new ArrayList<String>();
        typeArray=readingExcelforCameraTYPE();

        ArrayList<String> snArray = new ArrayList<String>();
        snArray=readingExcelforCameraSN();

        ArrayList<String> revArray = new ArrayList<String>();
        revArray=readingExcelforCameraREV();


        int size = ipArray.size();

        List<MainClass> camera = new ArrayList<MainClass>();
        for (int i = 0; i < size; i++) {
            camera.add(new MainClass()); //creating empty object
        }

        for (int j = 0; j < size; j++) {             //writing database each camera and its own info
            camera.get(j).setCamereIP(ipArray.get(j));
            camera.get(j).setCamereName(nameArray.get(j));
            camera.get(j).setCamereREV(revArray.get(j));
            camera.get(j).setCamereSN(snArray.get(j));
            camera.get(j).setCamereTYPE(typeArray.get(j));
            camera.get(j).setCameraStatus(camStatus(ipArray.get(j)));
            getDenemeRepository().save(camera.get(j));
        }

    }
}