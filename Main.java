import vehicles.AdsService;
import vehicles.VehicleAd;
import vehicles.vehicleTypes.vehicleTypeByBodyTypes.PickupType;
import vehicles.vehicleTypes.vehicleTypeByBodyTypes.SedanType;
import vehicles.vehicleTypes.vehicleTypeByFuelTypes.DieselType;
import vehicles.vehicleTypes.vehicleTypeByFuelTypes.PetrolType;
import vehicles.vehicleTypes.vehicleTypeByPurpose.CarType;
import vehicles.vehicleTypes.vehicleTypeByPurpose.PassengerType;
import vehicles.vehicleTypes.vehicleTypeByPurpose.TruckType;

class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd DevyatkaAd = new VehicleAd("VAZ", "228", new CarType(), new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, DevyatkaAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());

    }
}