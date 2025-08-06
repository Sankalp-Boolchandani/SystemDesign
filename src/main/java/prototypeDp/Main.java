package prototypeDp;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.1.1");
        networkConnection.loadImpData();
        networkConnection.setDomains(List.of("xDomain", "yDomain", "zDomain"));
        System.out.println(networkConnection);

        NetworkConnection networkConnection2=null;
        try{
            networkConnection2 = (NetworkConnection) networkConnection.clone();
            networkConnection2.getDomains().remove(0);
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(networkConnection.hashCode());
        System.out.println(networkConnection2.hashCode());
    }

}

// Prototype DP is used when we want to create a new object of a class that contains complex logics
// or big files that might take some time for loading. Such objects would take overhead for creation, and
// it would be a bad practise to create such big objects again and again. So using Prototype DP. we create the object of a complex class
// only once and if its required to create a similar object again, we clone the object.