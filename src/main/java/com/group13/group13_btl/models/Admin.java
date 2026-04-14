package com.group13.group13_btl.models;

import com.group13.group13_btl.services.AuctionManager;

public class Admin extends User {
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void cancelAuction(AuctionManager manager, String auctionId) {
        System.out.println("Quản trị viên: " + getName() + "đang xóa phiên đấu giá: " + auctionId);
        manager.removeAuction(auctionId);
    }
    public void banUser(String userId) {
        System.out.println("Quản trị viên: " + getName() + "đã khóa tài khoản có ID: " + userId);
    }
    public void displayInfo() {
        System.out.println("Tôi là quản trị viên hệ thống (Admin)");
    }
}