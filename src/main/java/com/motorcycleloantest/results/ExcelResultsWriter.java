package com.motorcycleloantest.results;

import net.serenitybdd.core.results.results.StepResult;
import net.serenitybdd.core.steps.Step;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelResultsWriter extends SerenityResultsWriter {

    @Override
    public void writeResults(List<StepResult> stepResults) throws IOException {
        // Crear un nuevo archivo de Excel
        Workbook workbook = new XSSFWorkbook();

        // Crear una hoja de trabajo
        Sheet sheet = workbook.createSheet("Results");

        // Escribir los resultados a la hoja de trabajo
        for (StepResult stepResult : stepResults) {
            Row row = sheet.createRow(stepResult.getStepIndex() + 1);

            // Escribir el nombre del paso
            Cell cell = row.createCell(0);
            cell.setCellValue(stepResult.getStep().getName());

            // Escribir el resultado del paso
            cell = row.createCell(1);
            cell.setCellValue(stepResult.getResult());

            // Escribir el mensaje del paso
            cell = row.createCell(2);
            cell.setCellValue(stepResult.getDescription());
        }

        // Guardar el archivo de Excel
        workbook.write(new FileOutputStream("results.xlsx"));
    }
}