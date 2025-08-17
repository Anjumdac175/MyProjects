using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace DbFirst.Models;

public partial class Actsjune25Context : DbContext
{
    public Actsjune25Context()
    {
    }

    public Actsjune25Context(DbContextOptions<Actsjune25Context> options)
        : base(options)
    {
    }

    public virtual DbSet<Department> Departments { get; set; }

    public virtual DbSet<Employee> Employees { get; set; }

    public virtual DbSet<Student> Students { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseSqlServer("Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=ACTSJUNE25;Integrated Security=True");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Department>(entity =>
        {
            entity.HasKey(e => e.DeptNo).HasName("PK__Departme__0148CAAE9B057EBB");

            entity.Property(e => e.DeptNo).ValueGeneratedNever();
            entity.Property(e => e.DeptName)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        modelBuilder.Entity<Employee>(entity =>
        {
            entity.HasKey(e => e.EmpNo).HasName("PK__Employee__AFB335924F94DD7B");

            entity.Property(e => e.EmpNo)
                .ValueGeneratedNever()
                .HasColumnName("empNo");
            entity.Property(e => e.Basic).HasColumnType("decimal(18, 2)");
            entity.Property(e => e.EmpName)
                .HasMaxLength(10)
                .IsFixedLength()
                .HasColumnName("empName");

            entity.HasOne(d => d.DeptNoNavigation).WithMany(p => p.Employees)
                .HasForeignKey(d => d.DeptNo)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("FK_Employees_Departments");
        });

        modelBuilder.Entity<Student>(entity =>
        {
            entity.HasKey(e => e.RollNo).HasName("PK__Student__7886D5A009565C1C");

            entity.ToTable("Student");

            entity.Property(e => e.RollNo).ValueGeneratedNever();
            entity.Property(e => e.Email)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
