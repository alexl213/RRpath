import com.acmerobotics.roadrunner.geometry.Pose2d
import com.acmerobotics.roadrunner.geometry.Vector2d
import com.acmerobotics.roadrunner.trajectory.Trajectory
import com.acmerobotics.roadrunner.trajectory.TrajectoryBuilder
import com.acmerobotics.roadrunner.trajectory.constraints.DriveConstraints
import com.acmerobotics.roadrunner.trajectory.constraints.MecanumConstraints
import java.util.Vector

object TrajectoryGen {
    // Remember to set these constraints to the same values as your DriveConstants.java file in the quickstart
    private val driveConstraints = DriveConstraints(35.0, 30.0, 0.0, 162.1250311208178.toRadians, 162.1250311208178.toRadians, 0.0)

    // Remember to set your track width to an estimate of your actual bot to get accurate trajectory profile duration!
    private const val trackWidth = 16.34

    private val combinedConstraints = MecanumConstraints(driveConstraints, trackWidth)

    // RED CLOSE START POSE
//    private val startPose = Pose2d(12.0,-63.0, Math.toRadians(-90.0) )

    // RED FAR START POSE
//    private val startPose = Pose2d(-36.0, -63.0, Math.toRadians(-90.0))

    // BLUE CLOSE START POSE
//    private val startPose = Pose2d(12.0,63.0, Math.toRadians(90.0) )

    // BLUE FAR START POSE
//    private val startPose = Pose2d(-36.0, 63.0, Math.toRadians(90.0))

    fun createTrajectory(): ArrayList<Trajectory> {
        val list = ArrayList<Trajectory>()

        // RED CLOSE LEFT SIDE AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-21.0)
//            .splineTo(Vector2d(9.0,-36.0), Math.toRadians(0.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-10.0)
//            .splineTo(Vector2d(40.0, -30.5), Math.toRadians(0.0))
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(), builder2.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeLeft(24.0)
//            .build()

        // RED CLOSE RIGHT SIDE AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-20.0)
//            .splineTo(Vector2d(15.0,-36.0), Math.toRadians(180.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-3.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeRight(5.0)
//            .splineTo(Vector2d(30.0, -50.0), Math.toRadians(0.0))
//            .splineTo(Vector2d(40.0, -41.0), Math.toRadians(90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()
//        val builder5 = TrajectoryBuilder(builder4.end(),builder3.end().heading, combinedConstraints)
//            .strafeLeft(22.0)
//            .build()


        // RED CLOSE FORWARD AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-5.0)
//            .splineTo(Vector2d(16.0, -42.0), Math.toRadians(90.0))
//            .splineTo(Vector2d(12.0,-33.0), Math.toRadians(-90.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-5.0)
//            .splineTo(Vector2d(40.0, -34.0), Math.toRadians(0.0))
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // RED FAR LEFT AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-21.0)
//            .splineTo(Vector2d(-39.0,-36.0), Math.toRadians(0.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-3.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeRight(8.0)
//            .splineTo(Vector2d(-20.0, -12.0), Math.toRadians(0.0))
//            .strafeRight(30.0)
//            .splineTo(Vector2d(40.0, -30.5), Math.toRadians(90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // RED FAR RIGHT AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-20.0)
//            .splineTo(Vector2d(-33.0,-36.0), Math.toRadians(180.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-3.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeLeft(8.0)
//            .splineTo(Vector2d(40.0, -41.0), Math.toRadians(-90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // RED FAR FORWARD AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-47.0)
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-4.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeLeft(35.0)
//            .splineTo(Vector2d(40.0, -36.0), Math.toRadians(-90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // BLUE CLOSE LEFT SIDE AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-20.0)
//            .splineTo(Vector2d(15.0,36.0), Math.toRadians(180.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-3.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeRight(5.0)
//            .splineTo(Vector2d(30.0, 22.0), Math.toRadians(0.0))
//            .splineTo(Vector2d(40.0, 42.0), Math.toRadians(90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // BLUE CLOSE RIGHT SIDE AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-21.0)
//            .splineTo(Vector2d(8.0,36.0), Math.toRadians(0.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-10.0)
//            .splineTo(Vector2d(40.0, 30.5), Math.toRadians(0.0))
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(), builder2.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // BLUE CLOSE FORWARD AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-5.0)
//            .splineTo(Vector2d(16.0, 42.0), Math.toRadians(-90.0))
//            .splineTo(Vector2d(12.0,33.0), Math.toRadians(90.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-5.0)
//            .splineTo(Vector2d(40.0, 36.0), Math.toRadians(0.0))
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // BLUE FAR LEFT AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-20.0)
//            .splineTo(Vector2d(-32.0,36.0), Math.toRadians(180.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-3.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeRight(8.0)
//            .splineTo(Vector2d(40.0, 41.0), Math.toRadians(90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // BLUE FAR RIGHT AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-21.0)
//            .splineTo(Vector2d(-40.0,36.0), Math.toRadians(0.0))
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-3.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeLeft(8.0)
//            .splineTo(Vector2d(-20.0, 12.0), Math.toRadians(0.0))
//            .strafeLeft(30.0)
//            .splineTo(Vector2d(40.0, 30.5), Math.toRadians(-90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // BLUE FAR FORWARD AUTO
        //      |
        //      |
        //      |
        //    \ | /
        //     \|/

//        val builder1 = TrajectoryBuilder(startPose, startPose.heading, combinedConstraints)
//            .forward(-47.0)
//            .build()
//        val builder2 = TrajectoryBuilder(builder1.end(),builder1.end().heading, combinedConstraints)
//            .forward(-4.0)
//            .build()
//        val builder3 = TrajectoryBuilder(builder2.end(),builder2.end().heading, combinedConstraints)
//            .strafeRight(35.0)
//            .splineTo(Vector2d(40.0, 36.0), Math.toRadians(90.0))
//            .build()
//        val builder4 = TrajectoryBuilder(builder3.end(),builder3.end().heading, combinedConstraints)
//            .forward(-12.0)
//            .build()

        // RED TEST AUTO

//        list.add(builder1)
//        list.add(builder2)
//        list.add(builder3)
//        list.add(builder4)
//        list.add(builder5)


        return list
    }

    fun drawOffbounds() {
        GraphicsUtil.fillRect(Vector2d(0.0, -63.0), 18.0, 18.0) // robot against the wall
    }
}

val Double.toRadians get() = (Math.toRadians(this))
