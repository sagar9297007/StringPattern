import java.util.*;
class StringPattern1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a font size");
		int n=sc.nextInt();

		System.out.println("enter a string");
		String s= sc.next();

		s=s.toUpperCase();

		for (int i=1;i<=n;i++)
		{
				for(int k=0;k<s.length();k++)
				{
					char c=s.charAt(k);
				
					switch(c)
					{
						case 'A':
										for (int j=1;j<=n;j++)
										{
											if(j==1&&i>n/2||j==n&&i>n/2||i==1&&j==n/2||i+j==n/2+1||i+j==(n/2+2*i)||i==n/2)
											{
												System.out.print("*");
											}
											else
											{
												System.out.print(" ");
											}
								    	}

										break;

						case 'B':
										
										for (int j=1;j<=n;j++)
										{
											if ((i==1&&j!=n)||j==(n-(n-(n/5)))||(i==(n/2)&&j!=n&&j>=(n/5))||(j==n&&i!=1&&i!=(n/2)&&i!=n)||(i==n&&j!=n))
											{
												System.out.print("*");
											}
											else 
											{
												System.out.print(" ");
											}
										}
										
										break;

						case 'C':
									
											
											for (int j=1;j<=n;j++)
											{
												if (j==1&&i!=1&&i!=2&&i!=n&&i!=(n-1)||i==1&&j!=1&&j!=2||i==n&&j!=1&&j!=2||i==(n-1)&&j==2||i==2&&j==2)
												{
													System.out.print("*");
												}
												else 
												{
													System.out.print(" ");
												}
											}
											
											break;

						case'D':
								
									
									for (int j=1;j<=n;j++)
									{
										if (i==1&&j!=n||i==n&&j!=n||j==(n/5)||j==n&&i!=1&&i!=n)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

						case 'E':
								
									
									for (int j=1;j<=n;j++)
									{
										if (i==1||i==(n/2)&&j!=1&&j<=(n-(n/5))||i==n||j==(n/5)||j==n&&((i<=(n/5)||i>=(n-(n/10))))||(j==(n-(n/5))&&(i>=((n/2)-(n/10)))&&(i<=((n/2)+(n/10)))))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
									
									break;

						case'F':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1||i==(n/2)&&j>(n/5)&&j<=(n-(n/5))||j==(n-(n-(n/5)))||j==n&&((i<=(n/5)))||(j==(n-(n/5))&&(i>=((n/2)-(n/10)))&&(i<=((n/2)+(n/10))))||i==n&&j<=(n-(n-(n/5)))+(n/10)+(n/10))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
									
									break;

						case'G':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1&&j<((n-(n/5))+n/10)||i==n&&j>(n/2)||j==1&&i<((3*n/4)+(n/10))||i==((3*n/4)+(n/10))&&j<((n-(n/5))+n/10)||j==((3*n/4)+(n/10))&&(i>=((n/2)))||j==((3*n/4)+(n/10))&&i<=(n/4)||i==(n/2)&&j>(n/2))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
									
									break;

						case'H':
									
									for (int j=1;j<=n;j++)
									{
										if ((j==(n/5)+n/10)||j==(n-(n/5))||i==(n/2)&&j>((n/5)+n/10)&&j<((n-(n/5)))||i==1&&j>((n/2)+(n/50)+(n/10))&&j<=((n-(n/10))+(n/20))||i==1&&j<((n/2)+(n/50))&&j>((n/10))||i==n&&j<((n/2)+(n/50))&&j>((n/10))||i==n&&j>((n/2)+(n/50)+(n/10))&&j<=((n-(n/10))+(n/20)))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
					
									break;
								
						case'I':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1||i==n||j==(n/2))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

								break;

						case'J':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1||i==n&&j<(n/2)&&j!=1||j==1&&i>((n/2)+(n/5))&&i!=n||j==(n/2)&&i!=(n))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

							case'K':
									
									for (int j=n/2;j<=n;j++)
									{
										if(j==(n/2)||i==j&&i>(n/2)&&j>(n/2)||i+j==n+1&&i<=(n/2)&&j>(n/2))
										{
											System.out.print("*");
										}
										else
										{
											System.out.print(" ");
										}
									}

									break;
							
							case'L':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1&&j<(n/2)||i==(n-(n/10))||j==(n/5)&&i<=(n-(n/5)+(n/10))||j==n&&i>(n-(n/2)+(n/5)))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

							case'M':
									
									for (int j=1;j<=n;j++)
									{
										if (j==1||i==j&&i<=(n/2)&&j<=(n-(n/2))||i+j==n+1&&i<=(n/2)&&j>=(n-(n/2))||j==n)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
									break;

							case'N':
									
									for (int j=1;j<=n;j++)
									{
										if (j==(n/5)||(i+(n/4))==(j+(n/10))&&j<(n-(n/10))||j==(n-(n/10))||i==1&&j<(n/4)||i==n&&j<(n/4)+(n/5)||i==n&&j>(n-((n/4)+(n/10)))||i==1&&j>(n-((n/4)+(n/10))))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

							case'O':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1&&j!=n&&j!=1||i==n&&j!=n&&j!=1||j==1&&i!=n&&i!=1||j==n&&i!=n&&i!=1)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
									break;	
							
							case'P':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1&&j!=n||i==n&&j<(n/2)||i==(n/2)&&j>(n/5)&&j!=n||j==(n/5)||j==n&&i!=n&&i!=1&&i<(n/2))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
									break;	

							case'Q':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1&&j<(n-(n/10))&&j!=1||i==(n-(n/5))&&(j!=1&&j!=n)&&j<(n-n/5)+(n/10)||j==1&&i!=(n-(n/5))&&i!=n&&i!=1&&i<(n-(n/5))||j==(n-(n/10))&&i<(n-(n/5))&&i<(n-(n/5))&&i!=n&&i!=1||i+(n/5)==j+n/10&&i>(n/2)&&j>(n/2))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;
									
							case'R':
									for (int j=1;j<=n;j++)
									{
										if(i==1&&j<(3*n/4)&&j>(n/4)||j==(n/2)||i==j&&i>(n/2)&&j>(n/2)||i==n&&j<(3*n/4)&&j>(n/4)||i==1&&j!=n||j==n&&i<(n-(n/2))&&i!=1||i==n/2&&j>n/2&&j!=n)
										{
											System.out.print("*");
										}
										else
										{
											System.out.print(" ");
										}	
									}
									
									break;

							case'S':
									
									for (int j=1;j<=n;j++)
									{
										if(i==(n/10)+1&&j!=n&&j!=1||i==(n-(n/10))&&j!=1&&j!=n||j==1&&i>(n/10)+1&&i<((n/2)+1)||j==1&i>(3*n/4)||j==n&&i<(n-(3*n/4))+1||j==n&&i>(n/2)&&i<(n-(n/10))||i==(n/2)+1)
										{
											System.out.print("*");
										}
										else
										{
											System.out.print(" ");
										}
									}

									break;

							case'T':
									
									for (int j=1;j<=n;j++)
									{
										if (i==(n/10)+1||j==(n/2)&&i>(n/10)||j==n&&i<n/4+2||j==1&&i<n/4+2||i==n&&j>(n/4)&&j<(3*n/4)+1)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

							case'U':
									
									for (int j=1;j<=n;j++)
									{
										if (j==(n/5)&&i!=n||j==(n-(n/5))&&i!=n||i==n&&j<n-(n/5)&&j>(n/5)&&j!=(n/5)&&j!=(n-(n/5))||i==1&&j<(n/4)||i==1&&j>(3*n/4))
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

							case'V':
									
									for (int j=1;j<=n;j++)
									{
										if(j==1&&i<=n/2||j==n&&i<=n/2||i+j==n/2+n+1||i-j==n/2)
										{
											System.out.print("*");
										}
										else
										{
											System.out.print(" ");
										}
									}

									break;

							case'W':
									
									for (int j=1;j<=n;j++)
									{
										if (i==j&&i>(n/2)||i+j==n+1&&i>(n/2)||j==1||j==n)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

							case'X':
									
									for (int j=1;j<=n;j++)
									{
										if (i==j||i+j==n+1)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;

							case'Y':
									
									for (int j=1;j<=n;j++)
									{
										if (i==j&&i<=(n/2)||i+j==n+1)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}
									

									break;

							case'Z':
									
									for (int j=1;j<=n;j++)
									{
										if (i==1||i+j==n+1||i==n)
										{
											System.out.print("*");
										}
										else 
										{
											System.out.print(" ");
										}
									}

									break;
					}
				}
			System.out.println();
		}
	}
}
