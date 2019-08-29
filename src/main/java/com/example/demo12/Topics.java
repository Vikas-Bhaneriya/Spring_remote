
package com.example.demo12;

import javax.management.remote.SubjectDelegationPermission;

public class Topics {


    private String id;
    private String name;
    private String desciption;
    public Topics()
    {

    }
public Topics(String id, String name , String des)
{
    super();
    this.desciption=des;
    this.id=id;
    this.name=name;



}

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
