package Pacet;

import javax.faces.application.*;
import javax.faces.bean.*;
import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.event.*;

@ManagedBean(name ="empl")
@SessionScoped
//НЕ РАБОТАЕТ!! не знаю почему. Просмотреть дома ЗЗЫ ПОЧИНИЛ
public class Employee implements java.io.Serializable{
private int age = 35;
private String fname ="Alex";
public int getAge(){return age;}
public void setAge(int age){this.age = age;}
public String getName(){return fname;}
public void setName(String fname){this.fname=fname;}
public Employee(){} //konstr

public void controlAge(FacesContext context, UIComponent toValidate, Object value){  //Валидатор для конвентера
int age = (Integer)value;
if(age<21)
{((UIInput) toValidate).setValid(false);
FacesMessage msg = new FacesMessage("bad date");
context.addMessage(toValidate.getClientId(context), msg);
}}

//
public void newName(ValueChangeEvent ev)
{System.out.println(ev.getOldValue()+""+ev.getNewValue());
}
}
//на кнопке xhtml можно задать вызов функции. action = #F
