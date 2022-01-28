package vehicles.vehicleTypes.vehicleTypeByFuelTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
