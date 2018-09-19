package com.example.coolweather.db;

/**
 * Created by 97205 on 2018/9/19.
 */

public class Province extends DataSupport{

    private int id;//每个实体类中应该有的字段
    private String privinceName;//省名字
    private int privinceCode;//省代号
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getPrivinceName(){
        return privinceName;
    }
    public void setPrivinceName(String privinceName){
        this.privinceName = privinceName;
    }
    public int getPrivinceCode(){
        return privinceCode;
    }
    public void setPrivinceCode(int privinceCode){
        this.privinceCode = privinceCode;
    }
}
