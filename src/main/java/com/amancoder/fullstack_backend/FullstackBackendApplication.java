// Note: If you see "npm.ps1 cannot be loaded because running scripts is disabled"
// Common fixes:
//  - Run npm via the .cmd wrapper from PowerShell: & npm.cmd install   OR  & npm.cmd run dev
//  - Use cmd.exe or Git Bash: cmd /c "npm i"  or use Git Bash and run npm i
//  - Allow scripts for current user (one-time): powershell -Command "Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned -Force"
//  - One-off bypass: powershell -ExecutionPolicy Bypass -Command "npm i"

package com.amancoder.fullstack_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullstackBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackBackendApplication.class, args);
	}

}
