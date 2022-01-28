package vehicles.vehicleTypes.vehicleTypeByPurpose;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
