func equals(a, b)
	return a = b;
endfunc

func main()
	write -1.0;
	write -1;
	write "Test Robot: ";
	rSet(1.1,1.1,90.0);
	rTrail(true);
	oSet(1.1,30.0,2.0,2.0);
	rMove(70.0);
	rTurn(-90.0);
	rMove(20.0);
	rTrail(rFeel(1));
	rTurn(360.0);
	write rXPosition();
	write rYPosition();
	write rRotation();
  write "Test de Strings i Float: ";
  s = "potato";
  f = 1.0;
  f2 = 2.9;
  f3 = 2.0;
  f4 = f * f2 / f3;
  write f4;
  write 12 % 7;
  n = "potato";
  m = n;
  write m;
  if equals(s, m) then write "GLaDoS" endif;
  write "Solucio: ";
  write s;
endfunc
