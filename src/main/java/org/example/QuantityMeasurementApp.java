package org.example;
import org.example.controller.QuantityMeasurementController;
import org.example.dto.QuantityDTO;
import org.example.repository.IQuantityMeasurementRepository;
import org.example.repository.QuantityMeasurementDatabaseRepository;
import org.example.util.DatabaseInitializer;
import org.example.service.IQuantityMeasurementService;
import org.example.service.QuantityMeasurementServiceImpl;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        //  Initialize DB
        DatabaseInitializer.init();

        IQuantityMeasurementRepository repo =
                new QuantityMeasurementDatabaseRepository();

        IQuantityMeasurementService service =
                new QuantityMeasurementServiceImpl(repo);

        QuantityMeasurementController controller =
                new QuantityMeasurementController(service);

        controller.performComparison(
                new QuantityDTO(1, "FEET", "LENGTH"),
                new QuantityDTO(12, "INCHES", "LENGTH")
        );
    }
}