import React from "react";
import { FaFacebook, FaTwitter, FaInstagram } from "react-icons/fa"; // Import icons from React Icons library

function FooterComponent() {
  return (
    <div>
      <footer className="footer">
        <div className="left-content">
          <span>&copy; 2024 Lad Mayc. All rights reserved.</span>
        </div>
        <div className="social-icons">
          <a
            href="https://www.facebook.com/hrttracker.sinu?mibextid=kFxxJD"
            className="social-icon"
          >
            <FaFacebook size={30} />
          </a>
          <a
            style={{ marginLeft: "20px" }}
            href="https://www.twitter.com"
            className="social-icon"
          >
            <FaTwitter size={30} />
          </a>
          <a
            style={{ marginLeft: "20px" }}
            href="https://www.instagram.com/mayc_lad?igsh=MXRoNXloaHJvN2t3dA=="
            className="social-icon"
          >
            <FaInstagram size={30} />
          </a>
        </div>
      </footer>
    </div>
  );
}

export default FooterComponent;
