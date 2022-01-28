package vehicles.vehicleTypes.vehicleTypeByBodyTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
