<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <style type="text/css">
        /* Footer Styles */
        .footer {
            background-color: #080808;
            padding: 40px 0;
            color: #eceff1;
        }

        .footer h4 {
            color: #007bff;
        }

        .footer p {
            color: #eceff1;
        }

        /* Quick Links */
        
/* Footer Styles */
.footer {
    background-color: #080808;
    padding: 40px 0;
    color: #eceff1;
    margin-top: auto; /* Push the footer to the bottom */
}

.footer h4 {
    color: #007bff;
}

.footer p {
    color: #eceff1;
}

/* Quick Links */
.footer ul {
    list-style-type: none;
    padding: 0;
}

.footer ul li {
    margin-bottom: 10px;
}

.footer ul li a {
    color: #eceff1;
    text-decoration: none;
}

.footer ul li a:hover {
    color: #03a9f4;
}

/* Social Media Icons */
.social-icons {
    list-style-type: none;
    padding: 0;
}

.social-icons li {
    display: inline-block;
    margin-right: 10px;
}

.social-icons a {
    color: #007bff;
    font-size: 18px;
    text-decoration: none;
}

.social-icons a:hover {
    color: #0056b3;
}
    </style>
</head>
<body>

    <!-- Your main content goes here -->

    <!-- Footer -->
    <footer class="footer">
        <div class="container">
            <div class="row">
                <!-- Project Description -->
                <div class="col-md-4">
                    <h4>About E-Notes</h4>
                    <p>E-Notes is your go-to platform for taking and managing digital notes. Whether you're a student, professional, or simply someone who loves to stay organized, E-Notes provides a convenient way to jot down and access your notes anytime, anywhere.</p>
                </div>

                <!-- Quick Links -->
                <div class="col-md-4">
                    <h4>Quick Links</h4>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Features</a></li>
                        <li><a href="#">Download App</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>

                <!-- Contact Information -->
                <div class="col-md-4">
                    <h4>Contact Us</h4>
                    <p>Email: official.shahnoor@gmail.com</p>
                    <p>Phone: +91 913-686-1845</p>
                    <p>Address: Mumbai, India</p>
                </div>
            </div>

            <!-- Copyright -->
            <div class="row mt-4">
                <div class="col-md-12 text-center">
                    <p>&copy; <%= new java.util.Date().getYear() + 1900 %> E-Notes. All Rights Reserved.</p>
                </div>
            </div>
        </div>
    </footer>

    <!-- Include your script files and closing body/html tags here -->

</body>
</html>
