package vehicles.vehicleTypes.vehicleTypeByFuelTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
