import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { PaymentService } from 'src/app/paymentservice';
import { LoginAccount } from 'src/app/LoginAccount';
import { UserService } from 'src/app/UserService';

@Component({
  selector: 'app-coupon2',
  templateUrl: './coupon2.component.html',
  styleUrls: ['./coupon2.component.css']
})
export class Coupon2Component implements OnInit {

 loginAccount:LoginAccount=new LoginAccount();
 
  constructor(private route: Router,private service:PaymentService,private userservice:UserService) 
  { }
result:any;
submitted=false;
  ngOnInit() {
  }
  onCoupon()
  {
    console.log("Hiiiii");
    this.loginAccount.imageUrl="https://cdn.singpromos.com/wp-content/uploads/2017/12/Popeyes-NEW-coupon-feat-4-Dec-2017.jpg";
    this.service.copName=this.loginAccount.imageUrl;
    console.log(this.service.copName);
    this.route.navigateByUrl("coupon-app2");
  }
  OnCart()
  {
    this.submitted=true
    this.loginAccount.imageUrl="https://theshazworld.files.wordpress.com/2017/09/21766944_1496146063778602_1895551401_o.png?w=400&h=200&crop=1";
    /* this.service.copName=this.loginAccount.imageUrl; */
     
    this.loginAccount.price=3;
    this.loginAccount.username=this.userservice.value.username;
  console.log("addcart");
  console.log(this.loginAccount);
    

this.service.addCart(this.loginAccount).subscribe((response) =>{ 
  this.result=response
  console.log(this.result);
});
this.route.navigateByUrl("get-cart");  
}
}


  
   
     