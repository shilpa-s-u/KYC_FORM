<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enrollment of new customer</title>
</head>
<body>
<h3 style="color:blue;">${msg }</h3>
<%@taglib prefix="hai" uri="http://www.springframework.org/tags/form" %>
<hai:errors path="kyc.*"/>
<form action="added" method="POST">
<table>
<tr><td>customer_id*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="number" name="customer_id" placeholder="Enter the customer_id"></td>
                 
                </tr>
              </table>
            </td>
            </tr>
<tr><td>scheme*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><select name="scheme">
                   <option>Select Any scheme</option><option>SB</option><option>MIS</option>
                    <option>TD</option><option>SCSS</option><option>RD</option></td>
                </tr>
              </table>
            </td>
            </tr>
<tr><td>name_of_depositor*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="text" name="name_of_depositor" placeholder="Enter the name_of_depositor"></td>
                  </tr>
              </table>
            </td>
             </tr>   
         
           <tr>
            <td>address*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="text" name="address" ></td>
      
                </tr>
              </table>
            </td>
          </tr>   
         
         
            
<!-- Date Of Birth -->
          <tr>
            <td>Date of Birth*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="date" name="date_of_birth" ></td>
                  
                </tr>
              </table>
            </td>
          </tr>
      
<tr><td>pan_no*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="number" name="pan_no" placeholder="Enter the pan_no"></td>
                  
                </tr>
              </table>
            </td>
          </tr>





<tr><td>proof of identity(tick applicable)*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="vertical-align: bottom; width:100%;">
                <tr class="name-table">
                  <td><input type="checkbox" name="proof_of_identity" placeholder="tick applicable">driving license<br>
        <input type="checkbox" name="proof_of_identity" placeholder="tick applicable">passport<br>
         <input type="checkbox" name="proof_of_identity" placeholder="tick applicable">voter id<br>
         <input type="checkbox" name="proof_of_identity" placeholder="tick applicable">government id card<br>
         <input type="checkbox" name="proof_of_identity" placeholder="tick applicable">ration card<br>
         <input type="checkbox" name="proof_of_identity" placeholder="tick applicable">any other<br></td>
                  
                </tr>
              </table>
            </td>
           </tr>






<tr><td>proof of address(tick applicable)*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="checkbox" name="proof_of_address" placeholder="tick applicable">driving license<br>
        <input type="checkbox" name="proof_of_address" placeholder="tick applicable">telephone bill<br>
         <input type="checkbox" name="proof_of_address" placeholder="tick applicable">electricity bill<br>
         <input type="checkbox" name="proof_of_address" placeholder="tick applicable">ban account passbook<br>
         <input type="checkbox" name="proof_of_address" placeholder="tick applicable">ration card<br>
         <input type="checkbox" name="proof_of_address" placeholder="tick applicable">any other<br>
                  
                </tr>
              </table>
            </td>
           </tr>



<tr><td>place*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="text" name="place" placeholder="Enter the place">
                  
                </tr>
              </table>
            </td>
           </tr>



<tr><td>signature_of_depositor*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="text" name="signature_of_depositor" placeholder="Enter the signature_of_depositorl">
                  
                </tr>
              </table>
            </td>
           </tr>



<tr><td>signature_of_postmaster*</td>
            <td colspan="4">
              <table class="dob" cellpadding="0" cellspacing="0" border="0" style="display:inline-block; vertical-align: bottom;">
                <tr class="name-table">
                  <td><input type="text" name="signature_of_postmaster" placeholder="Enter the signature_of_postmaster">
                </tr>
              </table>
            </td>
           </tr>



<tr>
<td><input type="submit" value="enroll"></td><td><input type="reset" value="Clear"></td>
</tr>
</table>
</form>
</body>
</html>