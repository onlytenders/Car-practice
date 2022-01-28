package vehicles.vehicleTypes.vehicleTypeByFuelTypes;

import vehicles.vehicleTypes.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
