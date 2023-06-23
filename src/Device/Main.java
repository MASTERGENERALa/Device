package Device;

public class Main {
    public static void main(String[] args) {
        // Створення екземпляру класу Device
        Device device = new Device("Manufacturer 1", 999.99f, "ABC123");

        // Виклик методів доступу
        System.out.println("Device Manufacturer: " + device.getManufacturer());
        System.out.println("Device Price: " + device.getPrice());
        System.out.println("Device Serial Number: " + device.getSerialNumber());

        // Створення екземпляру класу Monitor
        Monitor monitor = new Monitor("Manufacturer 2", 1499.99f, "DEF456", 1920, 1080);

        // Виклик методів доступу
        System.out.println("Monitor Manufacturer: " + monitor.getManufacturer());
        System.out.println("Monitor Price: " + monitor.getPrice());
        System.out.println("Monitor Serial Number: " + monitor.getSerialNumber());
        System.out.println("Monitor Resolution X: " + monitor.getResolutionX());
        System.out.println("Monitor Resolution Y: " + monitor.getResolutionY());

        // Створення екземпляру класу EthernetAdapter
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Manufacturer 3", 99.99f, "GHI789", 1000, "00:11:22:33:44:55");

        // Виклик методів доступу
        System.out.println("Ethernet Adapter Manufacturer: " + ethernetAdapter.getManufacturer());
        System.out.println("Ethernet Adapter Price: " + ethernetAdapter.getPrice());
        System.out.println("Ethernet Adapter Serial Number: " + ethernetAdapter.getSerialNumber());
        System.out.println("Ethernet Adapter Speed: " + ethernetAdapter.getSpeed());
        System.out.println("Ethernet Adapter MAC: " + ethernetAdapter.getMac());
    }
}
