package vehicles.vehicleTypes.vehicleTypeByBodyTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class PickupType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
