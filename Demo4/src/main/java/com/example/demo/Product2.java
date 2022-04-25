package com.example.demo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product2 {
@Id
int prodid;
String prodname;
Date mfg;
Date exp;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getProdname() {
	return prodname;
}
public void setProdname(String prodname) {
	this.prodname = prodname;
}
public Date getMfg() {
	return mfg;
}
public void setMfg(Date mfg) {
	this.mfg = mfg;
}
public Date getExp() {
	return exp;
}
public void setExp(Date exp) {
	this.exp = exp;
}
@Override
public String toString() {
	return "Product2 [prodid=" + prodid + ", prodname=" + prodname + ", mfg=" + mfg + ", exp=" + exp + "]";
}


}
