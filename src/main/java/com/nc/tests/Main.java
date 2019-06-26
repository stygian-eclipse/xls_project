package com.nc.tests;

public class Main {
    public static void main(String[] args) {
        SXSSFWorkbook wb = new SXSSFWorkbook(100); // keep 100 rows in memory, exceeding rows will be flushed to disk
//        Sheet sh = wb.createSheet();
//        for(int rownum = 0; rownum < 1000; rownum++){
//            Row row = sh.createRow(rownum);
//            for(int cellnum = 0; cellnum < 10; cellnum++){
//                Cell cell = row.createCell(cellnum);
//                String address = new CellReference(cell).formatAsString();
//                cell.setCellValue(address);
//            }
//
//        }
//
//        // Rows with rownum < 900 are flushed and not accessible
//        for(int rownum = 0; rownum < 900; rownum++){
//            sh.getRow(rownum);
////            Assert.assertNull(sh.getRow(rownum));
//        }
//
//        // ther last 100 rows are still in memory
//        for(int rownum = 900; rownum < 1000; rownum++){
//            sh.getRow(rownum);
////            Assert.assertNotNull(sh.getRow(rownum));
//        }
//
//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream("C:\\Java\\XLS_Test.xlsx");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            wb.write(out);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // dispose of temporary files backing this workbook on disk
//        wb.dispose();
    }
}
