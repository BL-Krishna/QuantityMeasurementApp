package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.controller.QuantityMeasurementController;
import com.apps.quantitymeasurement.dto.QuantityDTO;
import com.apps.quantitymeasurement.repository.IQuantityMeasurementRepository;
import com.apps.quantitymeasurement.repository.QuantityMeasurementCacheRepository;
import com.apps.quantitymeasurement.repository.QuantityMeasurementDatabaseRepository;
import com.apps.quantitymeasurement.service.IQuantityMeasurementService;
import com.apps.quantitymeasurement.service.QuantityMeasurementServiceImpl;
import com.apps.quantitymeasurement.util.DatabaseInitializer;

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