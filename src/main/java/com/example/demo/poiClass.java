package com.example.demo;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class poiClass {
    public ArrayList<String> readingExcelforCameraname() throws IOException {
        XSSFSheet sheet = null;
        Row row = null;
        FileInputStream file = new FileInputStream(new File("C:\\Users\\cagri.civici\\Desktop\\kameraIP.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0); //scanning at first page

        ArrayList<String> cameraName = new ArrayList<String>();
        for(int rowIndex =0 ;rowIndex <= sheet.getLastRowNum();rowIndex++){
            row = sheet.getRow(rowIndex);
            if(row!=null){
                Cell cell = row.getCell(0); //cameraName
                if(cell != null){
                    cameraName.add(cell.toString());
                }
            }
        }
        cameraName.remove(0);

        return cameraName;
    }

    public ArrayList<String> readingExcelforCameraIP() throws IOException {
        XSSFSheet sheet = null;
        Row row = null;
        FileInputStream file = new FileInputStream(new File("C:\\Users\\cagri.civici\\Desktop\\kameraIP.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0); //scanning at first page

        ArrayList<String> cameraIP = new ArrayList<String>();

        for(int rowIndex =0 ;rowIndex <= sheet.getLastRowNum();rowIndex++){
            row = sheet.getRow(rowIndex);
            if(row!=null){
                Cell cell = row.getCell(1); //cameraName
                if(cell != null){
                    cameraIP.add(cell.toString());
                }
            }
        }
        cameraIP.remove(0);
        return  cameraIP;
    }

    public ArrayList<String> readingExcelforCameraTYPE() throws IOException {
        XSSFSheet sheet = null;
        Row row = null;
        FileInputStream file = new FileInputStream(new File("C:\\Users\\cagri.civici\\Desktop\\kameraIP.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0); //scanning at first page

        ArrayList<String> cameraType = new ArrayList<String>();

        for(int rowIndex =0 ;rowIndex <= sheet.getLastRowNum();rowIndex++){
            row = sheet.getRow(rowIndex);
            if(row!=null){
                Cell cell = row.getCell(2); //cameraName
                if(cell != null){
                    cameraType.add(cell.toString());
                }
            }
        }
        cameraType.remove(0);
        return  cameraType;
    }

    public ArrayList<String> readingExcelforCameraSN() throws IOException {
        XSSFSheet sheet = null;
        Row row = null;
        FileInputStream file = new FileInputStream(new File("C:\\Users\\cagri.civici\\Desktop\\kameraIP.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0); //scanning at first page

        ArrayList<String> cameraSN = new ArrayList<String>();

        for(int rowIndex =0 ;rowIndex <= sheet.getLastRowNum();rowIndex++){
            row = sheet.getRow(rowIndex);
            if(row!=null){
                Cell cell = row.getCell(3); //cameraName
                if(cell != null){
                    cameraSN.add(cell.toString());
                }
            }
        }
        cameraSN.remove(0);
        return  cameraSN;
    }

    public ArrayList<String> readingExcelforCameraREV() throws IOException {
        XSSFSheet sheet = null;
        Row row = null;
        FileInputStream file = new FileInputStream(new File("C:\\Users\\cagri.civici\\Desktop\\kameraIP.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0); //scanning at first page

        ArrayList<String> cameraREV = new ArrayList<String>();

        for(int rowIndex =0 ;rowIndex <= sheet.getLastRowNum();rowIndex++){
            row = sheet.getRow(rowIndex);
            if(row!=null){
                Cell cell = row.getCell(4); //cameraName
                if(cell != null){
                    cameraREV.add(cell.toString());
                }
            }
        }
        cameraREV.remove(0);
        return  cameraREV;
    }

}

