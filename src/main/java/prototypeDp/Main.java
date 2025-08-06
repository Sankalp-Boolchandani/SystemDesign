package prototypeDp;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.1.1");
        networkConnection.loadImpData();
        System.out.println(networkConnection);

        NetworkConnection networkConnection2=null;
        try{
            networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(networkConnection.hashCode());
        System.out.println(networkConnection2.hashCode());
    }

}
