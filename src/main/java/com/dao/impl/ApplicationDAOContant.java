package com.dao.impl;

public class ApplicationDAOContant {
    interface Ivehicle{
        String INSERT_VEHICLE_CATEGORY="insert into vehiclecategory(VehicleCategoryName) values (?)";
        String GET_VEHICLE_CATEGORIES="select VehicleCategoryId,VehicleCategoryName from vehiclecategory";
    }
}
