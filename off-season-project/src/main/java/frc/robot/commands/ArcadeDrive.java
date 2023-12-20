package frc.robot.commands;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase{
    private final PS4Controller ps4Controller;
    private final DriveTrain driveTrain;

    public ArcadeDrive(PS4Controller ps4Controller, DriveTrain driveTrain) {
        this.ps4Controller = ps4Controller;
        this.driveTrain = driveTrain;
        addRequirements(driveTrain);
    }

    public void initalize() {
        driveTrain.arcadeDrive(0, 0);
    }
    
    public void execute() {
        double rotate = ps4Controller.getRightX();
        double drive = ps4Controller.getLeftY();
        driveTrain.arcadeDrive(rotate, drive);
    
    }

    public void end(boolean interuppted) {
        driveTrain.arcadeDrive(0, 0);
    }

    public boolean isFinished() {
        return false;
        
    }
}
