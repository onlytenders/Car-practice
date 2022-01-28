package vehicles.vehicleTypes.vehicleTypeByPurpose;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
