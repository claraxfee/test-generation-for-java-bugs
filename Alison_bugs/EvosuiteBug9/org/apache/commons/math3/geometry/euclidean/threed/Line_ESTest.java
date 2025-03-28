/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 25 02:50:07 GMT 2025
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Line_ESTest extends Line_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = line0.revert();
      assertNotSame(line1, line0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getOrigin();
      assertEquals((-0.5), vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      boolean boolean0 = line0.isSimilarTo(line0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D1, vector3D0);
      Line line1 = new Line(line0);
      assertFalse(line1.equals((Object)line0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      assertEquals(Double.POSITIVE_INFINITY, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      assertNotNull(subLine0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getDirection();
      assertEquals(0.7071067811865475, vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = line0.toSubSpace(vector3D1);
      assertEquals(0.7071067811865475, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Line line0 = null;
      try {
        line0 = new Line(vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Vector3D vector3D2 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D1, vector3D2);
      Line line1 = new Line(vector3D1, vector3D0);
      boolean boolean0 = line1.isSimilarTo(line0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Vector3D vector3D2 = Vector3D.MINUS_K;
      Vector3D vector3D3 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D3, vector3D2);
      Line line1 = new Line(vector3D1, vector3D0);
      boolean boolean0 = line1.isSimilarTo(line0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      double double0 = line0.distance(line0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.distance(line0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals(Double.NaN, vector3D2.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.intersection(line0);
      assertNull(vector3D2);
  }
}
