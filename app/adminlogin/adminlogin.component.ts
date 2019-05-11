import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginAccount } from '../LoginAccount';
import { UserService } from '../UserService';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private fb: FormBuilder, private route: Router,private userService:UserService) { }
  regForm: FormGroup;
  submitted: boolean = false;
  response: any;
  check=true;
  loginAccount:LoginAccount=new LoginAccount();
  ngOnInit() {

    this.regForm = this.fb.group({
      username: ['', [Validators.required ]],
      password:['',[ Validators.required] ],
    });
   
  }
value:any;

  onLogin(){

    
    this.userService.validateAdmin(this.loginAccount)
    .subscribe((response) =>
    {
      

      
   /*    localStorage.setItem('Role','customer');
      localStorage.setItem('username',response['username']);
       */
      console.log("HiiiiiiHello")
      if(response!=null)
      {
        localStorage.setItem('Role','customer');
        localStorage.setItem('uname',response['username']);
        
         
         console.log("Hiiiiii")
        this.route.navigateByUrl("home");
      }
      else{
        this.route.navigateByUrl("sign-up");
      }
      this.value=response;
      console.log("inresponse vale")
      console.log(this.value)
     /*  this.service.userDetails(this.value);
 */
      console.log(response), error => console.log(error)});
    /* this.loginAccount=new LoginAccount(); */
   /*  console.log(this.loginAccount) */
   
    
   }
  
   readValue(key){
    console.log(key);
    return localStorage.getItem(key);
  }
  }
