/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author LTC
 */
public class Users {

    int id;
    String name;

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", name=" + name + ", pwd=" + pwd + ", role=" + role + '}';
    }
    String pwd;
    String role;
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getRole() {
        return role;
    }
  
}
