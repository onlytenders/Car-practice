package vehicles.vehicleTypes.vehicleTypeByBodyTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
