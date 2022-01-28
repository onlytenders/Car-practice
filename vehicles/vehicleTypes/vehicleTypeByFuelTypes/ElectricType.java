package vehicles.vehicleTypes.vehicleTypeByFuelTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class ElectricType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
