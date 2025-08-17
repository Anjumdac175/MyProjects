using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace CodeFirstFluentApi.Migrations
{
    /// <inheritdoc />
    public partial class InitialCreate : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Departments",
                columns: table => new
                {
                    DeptNo = table.Column<int>(type: "int", nullable: false),
                    DeptName = table.Column<string>(type: "varchar(50)", unicode: false, maxLength: 50, nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK__Departme__0148CAAE9B057EBB", x => x.DeptNo);
                });

            migrationBuilder.CreateTable(
                name: "Employees",
                columns: table => new
                {
                    empNo = table.Column<int>(type: "int", nullable: false),
                    empName = table.Column<string>(type: "nchar(10)", fixedLength: true, maxLength: 10, nullable: false),
                    Basic = table.Column<decimal>(type: "decimal(18,2)", nullable: false),
                    DeptNo = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK__Employee__AFB335924F94DD7B", x => x.empNo);
                    table.ForeignKey(
                        name: "FK_Employees_Departments",
                        column: x => x.DeptNo,
                        principalTable: "Departments",
                        principalColumn: "DeptNo");
                });

            migrationBuilder.CreateIndex(
                name: "IX_Employees_DeptNo",
                table: "Employees",
                column: "DeptNo");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Employees");

            migrationBuilder.DropTable(
                name: "Departments");
        }
    }
}
