package vehicles.vehicleTypes.vehicleTypeByBodyTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
