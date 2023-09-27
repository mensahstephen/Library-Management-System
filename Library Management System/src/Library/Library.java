package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<LibraryResource> resourceList;
    List<LibraryUser> userList;


    public Library(){
        resourceList = new ArrayList<LibraryResource>();
        userList = new ArrayList<LibraryUser>();
    }
    public void addResource(LibraryResource resource) {
        resourceList.add(resource);
    }

    public void addUser(LibraryUser user) {
        userList.add(user);
    }

    public void checkoutResource(LibraryUser user, LibraryResource resource) {

        if(!userList.contains(user) || !resourceList.contains(resource)){
            System.out.println("Invalid user or resource");
            return;
        }

        if(resource.isCheckedOut()){
            System.out.println("Resource is already checked out");
            return;
        }

        resource.checkOut(user);
    }

    public String getResourceInfo(LibraryResource resource) {
        StringBuilder sb = new StringBuilder();
        sb.append("Resource Info: \n");

        for (LibraryResource obj : resourceList) {
            sb.append(obj.getInfo());
        }

        return sb.toString();
    }

    public String getUserInfo(LibraryUser user) {
        StringBuilder sb = new StringBuilder();
        sb.append("User Info: \n");

        for (LibraryUser obj : userList) {
            sb.append(obj.displayUserInfo());
        }

        return sb.toString();
    }
}
