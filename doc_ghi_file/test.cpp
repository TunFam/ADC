#include <iostream>
#include <conio.h>
#include <iomanip>
#include <math.h>
#include <string.h>

using namespace std;
class sinhvien{
	public:
		char hoTen[15];
		char maSV[20];
		float diemTin;
		float diemMac;
		float diemAnh;
	public:
		void nhap(){
			cout<<"--------------";
			cout<<"\nnhap ho va ten: ";
			cin.ignore(1);
			cin.getline(hoTen,sizeof(hoTen));
			cout<<"\nnhap ma sinh vien: ";
			cin.getline(maSV,sizeof(maSV));

			do{
			cout<<"\n-------";
			cout<<"\nnhap diem tin: ";
			cin>>diemTin;
			cout<<"\nnhap diem mac: ";
			cin>>diemMac;
			cout<<"\nnhap diem anh: ";
			cin>>diemAnh;
			}while(diemAnh<0||diemAnh>10||diemMac<0||diemMac>10||diemTin<0||diemTin>10);
//			cin.getline(maSV,sizeof(maSV));
//			cout<<"\nnhap diem tin: ";
//			cin>>diemTin;
//			cout<<"\nnhap diem mac: ";
//			cin>>diemMac;
//			cout<<"\nnhap diem anh: ";
//			cin>>diemAnh;
		};
		void xuat(){
			cout<<"\n--------------"<<endl;
			cout<<"ho va ten: "<<hoTen<<endl<<"ma sinh vien: "<<maSV<<endl<<"diem tin: "<<diemTin<<endl<<"diem mac: "<<diemMac<<endl<<"diem anh: "<<diemAnh<<endl;
		};
		float tinhTB(){
			float tb;
			tb=(diemAnh+diemMac+diemTin)/3;
			return tb;
		};
};
main(){
	int n,i,dem=0;
	sinhvien *sv;
	cout<<"nhap so sinh vien: ";
	cin>>n;
	sv= new sinhvien[n+1];
	for(i=0;i<n;i++){
		sv[i].nhap();
	};
	cout<<"\n\n sinh vien co diem trung binh lon 6.5 va khong co mon nao duoi 5 ";
	for(i=0;i<n;i++){
		if(sv[i].tinhTB()>6.5 && sv[i].diemTin>=5 && sv[i].diemAnh>=5&&sv[i].diemMac>=5){
			sv[i].xuat();
			cout<<"\ndiem trung binh: "<<sv[i].tinhTB();
			dem++;
		};
	};
	if(dem==0){
		cout<<"\nkhong co sinh vien dat yeu cau!!! ";
	};
}