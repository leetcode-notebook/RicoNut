package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/25 7:19 AM
 */
public class LC_892_SurfaceAreaOf3dShapesTest {
    @Test
    public void test_surface_area_of_3D_shapes() {
        LC_892_SurfaceAreaOf3dShapes shapes = new LC_892_SurfaceAreaOf3dShapes();
        assertThat(shapes.surfaceArea(new int[][]{{2}}), is(10));
        assertThat(shapes.surfaceArea(new int[][]{{1, 2}, {3, 4}}), is(34));
        assertThat(shapes.surfaceArea(new int[][]{{1, 0}, {0, 2}}), is(16));
        assertThat(shapes.surfaceArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}), is(32));
    }
}
