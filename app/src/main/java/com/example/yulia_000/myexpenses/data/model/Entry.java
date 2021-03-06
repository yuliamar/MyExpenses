package com.example.yulia_000.myexpenses.data.model;

/**
 * Created by Yulia_000 on 15.01.2018.
 */

public class Entry {
        public static final String TAG = Entry.class.getSimpleName();
        public static final String TABLE = "Entry";

        // Labels Table Columns names
        public static final String KEY_ID = "id";
        public static final String KEY_UserID = "EntryId";
        public static final String KEY_Date = "Date";
        public static final String KEY_Description = "Description";
        public static final String KEY_Kategory = "Kategory";
        public static final String KEY_Amount = "Amount";

        private Integer ID;
        private Integer UserID ;
        private String Date;
        private String Description ;
        private String Kategory ;
        private String Amount ;

        public Integer getID() {
            return ID;
        }

        public void setID(Integer ID) {
            this.ID = ID;
        }

        public Integer getUserID() {
            return UserID;
        }

        public void setUserID(Integer userID) {
            this.UserID = userID;
        }

        public String getDate() {
            return Date;
        }

        public void setDate(String date) {
            Date = date;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getKategory() {
            return Kategory;
        }

        public void setKategory(String kategory) {
            Kategory = kategory;
        }

        public String getAmount() {
            return Amount;
        }

        public void setAmount(String amount) {
            Amount = amount;
        }
}
