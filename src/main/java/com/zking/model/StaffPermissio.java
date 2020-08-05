package com.zking.model;

public class StaffPermissio {
    private Integer yhStaffPermissioId;

    private Integer yhStaffId;

    private Integer yhPermissionId;

    public StaffPermissio(Integer yhStaffPermissioId, Integer yhStaffId, Integer yhPermissionId) {
        this.yhStaffPermissioId = yhStaffPermissioId;
        this.yhStaffId = yhStaffId;
        this.yhPermissionId = yhPermissionId;
    }

    public StaffPermissio() {
        super();
    }

    public Integer getYhStaffPermissioId() {
        return yhStaffPermissioId;
    }

    public void setYhStaffPermissioId(Integer yhStaffPermissioId) {
        this.yhStaffPermissioId = yhStaffPermissioId;
    }

    public Integer getYhStaffId() {
        return yhStaffId;
    }

    public void setYhStaffId(Integer yhStaffId) {
        this.yhStaffId = yhStaffId;
    }

    public Integer getYhPermissionId() {
        return yhPermissionId;
    }

    public void setYhPermissionId(Integer yhPermissionId) {
        this.yhPermissionId = yhPermissionId;
    }
}