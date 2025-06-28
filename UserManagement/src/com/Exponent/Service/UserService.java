package com.Exponent.Service;

import java.io.IOException;
import java.io.Serializable;

public interface UserService extends Serializable{

	public void addUser();

	public void displayAllUser();

	public void displaySingleUser();

	public void updateUserDetails();

	public void deleteUser();

	public void serialize() throws IOException;

	public void deserialize() throws ClassNotFoundException, IOException;
}
