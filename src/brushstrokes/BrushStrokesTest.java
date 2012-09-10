package brushstrokes;

import static org.junit.Assert.*;

import org.junit.Test;

public class BrushStrokesTest {

	@Test
	public void test() {
		assertEquals(4, BrushStrokes.minNumErrors("BBBB", 0, 0));
		assertEquals(0, BrushStrokes.minNumErrors("BBBB", 0, 1));
		assertEquals(4, BrushStrokes.minNumErrors("BBBB", 0, 2));

		assertEquals(4, BrushStrokes.minNumErrors("WWWW", 0, 0));
		assertEquals(4, BrushStrokes.minNumErrors("WWWW", 0, 1));
		assertEquals(0, BrushStrokes.minNumErrors("WWWW", 0, 2));

		assertEquals(2, BrushStrokes.minNumErrors("BBWW", 1, 0));
		assertEquals(0, BrushStrokes.minNumErrors("BBWW", 1, 1));
		assertEquals(2, BrushStrokes.minNumErrors("BBWW", 1, 2));

		assertEquals(2, BrushStrokes.minNumErrors("WWBB", 1, 0));
		assertEquals(2, BrushStrokes.minNumErrors("WWBB", 1, 1));
		assertEquals(0, BrushStrokes.minNumErrors("WWBB", 1, 2));

		assertEquals(1, BrushStrokes.minNumErrors("WBWW", 1, 0));
		assertEquals(2, BrushStrokes.minNumErrors("WBWWB", 1, 0));
		assertEquals(3, BrushStrokes.minNumErrors("WBWWWBB", 1, 0));
		assertEquals(1, BrushStrokes.minNumErrors("WBWWWBB", 2, 0));

		assertEquals(2, BrushStrokes.minNumErrors("WW-BB", 1, 0));
		assertEquals(0, BrushStrokes.minNumErrors("WW-BB", 2, 0));

		assertEquals(4, BrushStrokes.minNumErrors("WWWW-WBWB-BBBB", 2, 0));

	}
}
