
package com.example.android.inclassassignment07_yanranw;

import java.io.Serializable;


    public class Brand implements Serializable {
        String name;
        int history;
        boolean local;
        String information;

        public Brand(String name, int history, boolean local, String information){
            this.history = history;
            this.name = name;
            this.local = local;
            this.information = information;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getHistory(){
            return history;
        }
        public void setHistory(int n){
            this.history = n;
        }
        public boolean isLocal(){
            return local;
        }
        public void setLocal(boolean local){
            this.local = local;
        }

        public String getInformation() {
            return information;
        }

        public void setInformation(String information) {
            this.information = information;
        }

        public String toString(){
            return "Brand Name: " + name + "\nYears of history: " + history + "\nIs it a local brand? " + local + "\nAny additional information? " + information;
        }

    }


