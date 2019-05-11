import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { PaymentService } from '../paymentservice';
import { Cart } from '../cartPojo';
import { Router } from '@angular/router';
import { LoginAccount } from '../LoginAccount';
import { UserService } from '../UserService';
@Component({
  selector: 'app-coupondetails',
  templateUrl: './coupondetails.component.html',
  styleUrls: ['./coupondetails.component.css']
})
export class CoupondetailsComponent implements OnInit {
  [x: string]: any;

  result:any;
  constructor(private route:Router,private fb:FormBuilder,private cartservice:PaymentService,private service:UserService) { }
 value:any;
 code:any;
  loginAccount:LoginAccount=new LoginAccount();
  ngOnInit() {

   /*  this.regForm = this.fb.group({
      name: ['', [Validators.required,Validators.maxLength(20),Validators.minLength(3) ]]
  }); */

  this.onCart();
  }

  onCart()
  {
  // this.loginAccount.username=this.service.value.username;
/*     
    console.log(this.loginAccount) */
 
    
   this.cartservice.getUser().subscribe((response) =>{ 
      console.log("in response")
      console.log(response)
    
      this.result=response;
    }); 
// console.log(this.coupon)

    // console.log(this.result)

     // this.route.navigateByUrl("home"); 
     
  }
readValue(key){
return localStorage.getItem(key);
}
}
