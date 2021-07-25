package testJogl;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;

public class TestJogl {

    public static void main(String[] args) {
        TestJogl test = new TestJogl();

        test.run();
    }

    private final Renderer renderer;

    public TestJogl() {
        GLCapabilities caps = new GLCapabilities(GLProfile.get(GLProfile.GL4ES3));

        caps.setDoubleBuffered(true);

        GLWindow glWindow = GLWindow.create(caps);

        glWindow.setTitle("jogl-compute-shaders-fireworks");

        glWindow.setSize(800, 800);

        glWindow.setFullscreen(false);
        glWindow.setUndecorated(false);
        glWindow.setPointerVisible(true);
        glWindow.setVisible(true);

        Keyboard keyboard = new Keyboard();
        glWindow.addKeyListener(keyboard);

        renderer = new Renderer(glWindow, keyboard);

        glWindow.addGLEventListener(renderer);
    }

    public void run() {
        renderer.run();
    }

}
